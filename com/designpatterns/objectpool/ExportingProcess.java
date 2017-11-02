package com.designpatterns.objectpool;

/**
 * Exporting Process Class 
 */
public class ExportingProcess {

    private long processNumber;
    
    public ExportingProcess(long processNumber) {
        this.processNumber = processNumber;
    }
    
    public long getProcessNumber() {
        return processNumber;
    }
}
