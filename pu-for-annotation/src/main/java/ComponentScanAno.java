import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@ComponentScan
public class ComponentScanAno {
//
//    @ComponentScan的功能其实就是自动扫描并加载符合条件的组件（比如@Component和@Repository等）
//    或者bean定义，最终将这些bean定义加载到IoC容器中。
//
//    我们可以通过basePackages等属性来细粒度的定制@ComponentScan自动扫描的范围，如果不指定，
//    则默认Spring框架实现会从声明@ComponentScan所在类的package进行扫描。
//
//    注：所以SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages。


//    basePackageClasses：对basepackages()指定扫描注释组件包类型安全的替代。
//
//    excludeFilters：指定不适合组件扫描的类型。
//
//    includeFilters：指定哪些类型有资格用于组件扫描。
//
//    lazyInit：指定是否应注册扫描的beans为lazy初始化。
//
//    nameGenerator：用于在Spring容器中的检测到的组件命名。
//
//    resourcePattern：控制可用于组件检测的类文件。
//
//    scopedProxy：指出代理是否应该对检测元件产生，在使用过程中会在代理风格时尚的范围是必要的。
//
//    scopeResolver：用于解决检测到的组件的范围。
//
//    useDefaultFilters：指示是否自动检测类的注释

}
