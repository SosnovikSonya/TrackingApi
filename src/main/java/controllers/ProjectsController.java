package controllers;

import java.util.concurrent.atomic.AtomicLong;

import business.Project;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ProjectsController {

    @RequestMapping("/project")
    public Project[] getProjects(HttpServletRequest request ) {
        // TODO: authorize
        //String ada = request.getHeaders("asd").nextElement();
        Project[] projects = new Project[5];
        Project proj1 = new Project();
        proj1.id = 1;
        proj1.title = "java klass!";
        projects[0] = proj1;
        return projects;
    }
}
