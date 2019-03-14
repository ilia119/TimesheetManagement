package app.service.impl;

import app.entities.ProjectVersion;
import app.service.ProjectVersionService;
import org.springframework.stereotype.Service;

@Service
public class ProjectVersionServiceImpl implements ProjectVersionService {

    @Override
    public ProjectVersion getProjectVersion() {
        return new ProjectVersion().getProjectVersion();
    }
}
