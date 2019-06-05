package com.myk.learning.redislockredlock.support;

/**
 * 获取锁后需要做的逻辑
 *
 * @param <T> the type parameter
 * @author myk
 */
public interface AcquiredLockWorker<T> {
    /**
     * Invoke after lock aquire t.
     *
     * @return the t
     * @throws Exception the exception
     */
    T invokeAfterLockAcquire() throws Exception;
}
