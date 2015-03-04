package org.embulk.executor.mapreduce;

import org.embulk.config.Config;
import org.embulk.config.ConfigInject;
import org.embulk.config.ConfigDefault;
import org.embulk.config.ConfigSource;
import org.embulk.config.Task;
import org.embulk.config.ModelManager;
import org.embulk.spi.ProcessTask;

public interface MapReduceExecutorTask
        extends Task
{
    @Config("job_name")
    @ConfigDefault("embulk")
    public String getJobName();

    @ConfigInject
    public ModelManager getModelManager();

    public ConfigSource getExecConfig();
    public void setExecConfig(ConfigSource execConfig);

    public ProcessTask getProcessTask();
    public void setProcessTask(ProcessTask task);
}
