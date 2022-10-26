package com.example.springcloud.core.utils;

import lombok.extern.slf4j.Slf4j;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Vo操作工具类
 *
 * @author chenyuantao
 */
@Slf4j
public class VoUtils {

    /**
     * 对象属性复制
     *
     * @param source
     * @param targetClass
     * @return
     */
    public static <T> T copyProperties(Object source, Class<T> targetClass) {
        if (source == null) return null;
        try {
            T target = targetClass.newInstance();
            BeanUtils.copyProperties(source, target,getNullPropertyNames(source));
            return target;
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("copy entity to vo exception(" + targetClass.getSimpleName() + ")," + e.getMessage());
            return null;
        }
    }

    /**
     * 复制列表属性
     *
     * @param list
     * @param clazz
     * @return
     */
    public static <T, R> List<R> copyPropertiesForList(List<T> list, Class<R> clazz) {
        if (Objects.nonNull(list) && list.size() > 0) {
            List<R> voList = list.stream()
                    .map((entity) -> VoUtils.copyProperties(entity, clazz))
                    .collect(Collectors.toList());
            return voList;
        }
        return new ArrayList<R>(0);
    }

    /**
     * 设置对象的属性值
     *
     * @param source
     * @param filedName
     * @param value
     */
    @SuppressWarnings("unchecked")
    public static void setFiledValue(Object source, String filedName, Object value) {
        if (source != null && value != null) {
            Field field = null;
            try {
                field = source.getClass().getDeclaredField(filedName);
            } catch (Exception e) {
                //log.error(e.getMessage(), e);
            }
            try {
                if (field == null) {
                    for (Class<?> t : ReflectionUtils.getAllSuperTypes(source.getClass())) {
                        field = t.getDeclaredField(filedName);
                        if (field != null) break;
                    }
                }
            } catch (Exception e) {
                //log.error(e.getMessage(), e);
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(Boolean.TRUE);
                }
                try {
                    field.set(source, value);
                } catch (Exception e) {
                    //log.error(e.getMessage(), e);
                }
            }
        }
    }

    /**
     * 获取对象的属性值
     *
     * @param distObj
     * @param filedName
     */
    @SuppressWarnings("unchecked")
    public static Object getFiledValue(Object distObj, String filedName) {
        if (distObj != null) {
            Field field = null;
            try {
                field = distObj.getClass().getDeclaredField(filedName);
            } catch (Exception e) {
                //log.error(e.getMessage(), e);
            }
                if (field == null) {
                    Set<Class<?>> sets = ReflectionUtils.getAllSuperTypes(distObj.getClass());
                    for (Class<?> t : sets) {
                        try {
                            field = t.getDeclaredField(filedName);
                        } catch (Exception e) {
                            //log.error(e.getMessage(), e);
                            //System.out.println(e.getMessage());
                        }
                        //System.out.println(t.getName());
                        if (field != null) break;
                    }
                }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(Boolean.TRUE);
                }
                try {
                    return field.get(distObj);
                } catch (Exception e) {
                    //log.error(e.getMessage(), e);
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * pojo类转Map
     *
     * @param entityObj
     * @return
     */
    public static Map<String, Object> entityToMap(Object entityObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        @SuppressWarnings("unchecked")
        Set<Field> fields = ReflectionUtils.getAllFields(entityObj.getClass());
        for (Field field : fields) {
            if (!field.isAccessible()) {
                field.setAccessible(Boolean.TRUE);
            }
            try {
                map.put(field.getName(), field.get(entityObj));
            } catch (Exception e) {
                //log.warn("属性复制失败,field:" + field.getName() + ",：class:" + entityObj.getClass().getSimpleName(), e);
            }
        }
        return map;
    }

    public static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}

