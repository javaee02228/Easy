package easy.boot;

import easy.event.listener.EasyStartListener;
import org.springframework.boot.SpringApplication;
import org.springframework.core.io.ResourceLoader;

/**
 * @Description: the Description of this class
 * @Author: jp
 * @CreateDate: 2018/9/2
 * @Version: ${project.version}
 */
public class EasyApplication extends SpringApplication {

    public EasyApplication(Class<?>[] primarySources) {
        super(primarySources);
    }

    public EasyApplication(ResourceLoader resourceLoader, Class<?>[] primarySources) {
        super(resourceLoader, primarySources);
    }

    {
        this.addListeners(new EasyStartListener());
    }
}
