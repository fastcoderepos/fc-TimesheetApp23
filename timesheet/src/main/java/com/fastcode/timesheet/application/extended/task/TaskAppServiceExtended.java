package com.fastcode.timesheet.application.extended.task;

import com.fastcode.timesheet.application.core.task.TaskAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.project.IProjectRepositoryExtended;
import com.fastcode.timesheet.domain.extended.task.ITaskRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("taskAppServiceExtended")
public class TaskAppServiceExtended extends TaskAppService implements ITaskAppServiceExtended {

    public TaskAppServiceExtended(
        ITaskRepositoryExtended taskRepositoryExtended,
        IProjectRepositoryExtended projectRepositoryExtended,
        ITaskMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(taskRepositoryExtended, projectRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
