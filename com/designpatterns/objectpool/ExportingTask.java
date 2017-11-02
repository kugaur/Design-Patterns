package com.designpatterns.objectpool;

/**
 * Exporting Task Class 
 */
public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;
    private int threadNumber;
    
    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNumber) {
        this.pool = pool;
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread: " +  threadNumber + ": Object with Process Number: " + 
        exportingProcess.getProcessNumber() + " was borrowed");
        
        pool.returnObject(exportingProcess);
        System.out.println("Thread: " + threadNumber + ":Object with Process Number: " +
        exportingProcess.getProcessNumber() + " was returned");
        
    }
    

    
    
}
