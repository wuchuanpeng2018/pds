import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationAno {


//    @EnableAutoConfiguration 简单概括一下就是，借助@Import的支持，收集和注册特定场景相关的bean定义。
//
//    @EnableScheduling是通过@Import将Spring调度框架相关的bean定义都加载到IoC容器。
//    @EnableMBeanExport是通过@Import将JMX相关的bean定义加载到IoC容器。
//    而@EnableAutoConfiguration也是借助@Import的帮助，将所有符合自动配置条件的bean定义加载到IoC容器，仅此而已！

}

@SpringBootConfiguration
class SpringBootConfigurationAno{

//    @SpringBootConfiguration继承自@Configuration，二者功能也一致，标注当前类是配置类，
//    并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到spring容器中，并且实例名就是方法名。
}




