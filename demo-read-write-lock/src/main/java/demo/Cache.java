package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Cache {
    Map<String, String> map = new HashMap<>();
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void put(String key, String value){
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" ����д��,key:"+key);
            map.put(key, value);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+" �������");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.writeLock().unlock();
        }
    }

    public String get(String key){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" ���ڶ�ȡ");
            String value = map.get(key);
            System.out.println(Thread.currentThread().getName()+" ��ȡ���:"+value);
            return value;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.readLock().unlock();
        }
        return null;
    }
}
