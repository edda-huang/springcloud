package com.example.springcloud.basedata.util.sensitiveword;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 初始化敏感词库，将敏感词加入到HashMap中，构建DFA算法模型
 *
 * @author huangzhihua
 */
@Slf4j
public class SensitiveWordInit {
    /**
     * 敏感词库
     */
    public HashMap sensitiveWordMap;


    public static final String END_FLAG = "end";

    private static final String ENCODING = "UTF-8";


    /**
     * 初始化词库
     */
    @SuppressWarnings("rawtypes")
    public Map initKeyWordFromFile(File fileName) {
        try {
            //读取敏感词库
            Set<String> keyWordSet = readSensitiveWordFile(fileName);
            //将敏感词库加入到HashMap中
            addSensitiveWordToHashMap(keyWordSet);
            //spring获取application，然后application.setAttribute("sensitiveWordMap",sensitiveWordMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sensitiveWordMap;
    }

    /**
     * 初始化词库
     */
    @SuppressWarnings("rawtypes")
    public Map initKeyWordFromString(String keywords) {
        try {
            //读取敏感词库
            Set<String> keyWordSet = new HashSet<>();
            StringTokenizer tokenizer = new StringTokenizer(keywords, "\n");
            while (tokenizer.hasMoreTokens()) {
                keyWordSet.add(tokenizer.nextToken());
            }
            //将敏感词库加入到HashMap中
            addSensitiveWordToHashMap(keyWordSet);
            //spring获取application，然后application.setAttribute("sensitiveWordMap",sensitiveWordMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sensitiveWordMap;
    }

    /**
     * 封装敏感词库
     *
     * @param keyWordSet
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private void addSensitiveWordToHashMap(Set<String> keyWordSet) {
        // 初始化HashMap对象并控制容器的大小
        sensitiveWordMap = new HashMap(keyWordSet.size());
        // 敏感词
        String currentWord;
        // 用来按照相应的格式保存敏感词库数据
        Map<Object, Object> currentMap;
        // 用来辅助构建敏感词库
        Map<Object, Object> subMap;
        // 使用一个迭代器来循环敏感词集合
        Iterator<String> iterator = keyWordSet.iterator();
        while (iterator.hasNext()) {
            currentWord = iterator.next();
            // 等于敏感词库，HashMap对象在内存中占用的是同一个地址，所以此nowMap对象的变化，sensitiveWordMap对象也会跟着改变
            currentMap = sensitiveWordMap;
            for (int i = 0; i < currentWord.length(); i++) {
                // 截取敏感词当中的字，在敏感词库中字为HashMap对象的Key键值
                char keyChar = currentWord.charAt(i);

                // 判断这个字是否存在于敏感词库中
                subMap = (Map<Object, Object>) currentMap.get(keyChar);
                if (subMap == null) {
                    subMap = new HashMap<>();
                    currentMap.put(keyChar, subMap);
                }
                currentMap = subMap;

                // 如果该字是当前敏感词的最后一个字，则标识为结尾字
                if (i == currentWord.length() - 1) {
                    //如果是最后一个字符，则put一个结束标志，这里只需要保存key就行了，value为null可以节省空间。
                    //如果不是最后一个字符，则不需要存这个结束标志，同样也是为了节省空间。
                    currentMap.put(END_FLAG, null);
                }
                log.info("封装敏感词库过程：" + sensitiveWordMap);
            }
            log.info("查看敏感词库数据：" + sensitiveWordMap);
        }
    }

    /**
     * 读取敏感词库中的内容，将内容添加到set集合中
     *
     * @param file
     * @return
     * @throws Exception
     */
    @SuppressWarnings("resource")
    private Set<String> readSensitiveWordFile(File file) throws Exception {
        Set<String> set = null;

        BufferedReader bufferedReader = null;
        InputStreamReader read = new InputStreamReader(new FileInputStream(file), ENCODING);
        try {
            //文件是否存在
            if (file.isFile() && file.exists()) {
                set = new HashSet<String>();
                bufferedReader = new BufferedReader(read);
                String txt = null;
                //读取文件，将文件内容放入到set中
                while ((txt = bufferedReader.readLine()) != null) {
                    set.add(txt);
                }
            } else {         //不存在抛出异常信息
                throw new Exception("敏感词库文件不存在");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            read.close();     //关闭文件流
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return set;
    }
    
}