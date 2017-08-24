# spring-beans
Spring Basic Bean Life Cycle

Consider for Inner Bean - Should be Proto type...
	<bean id="" class="">
		<property name="">
			<bean class="reff"/>
		</property>
	</bean>

	AutowiredAnnotationBeanPostProcessor
	CommonAnnotationBeanProcessor
	PersistenceAnnotationBeanProcessor
	RequiredAnnotationBeanProcessor


@Required - RequiredAnnotationBeanProcessor

@Component

@Qualifier

@Resource

	



…or create a new repository on the command line

echo "# spring-beans" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/balinj/spring-beans.git
git push -u origin master
…or push an existing repository from the command line

git remote add origin https://github.com/balinj/spring-beans.git
git push -u origin master
…or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
