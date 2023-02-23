package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class MinestomProjectDependency extends DelegatingProjectDependency {

    @Inject
    public MinestomProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":code-generators"
     */
    public CodeGeneratorsProjectDependency getCodeGenerators() { return new CodeGeneratorsProjectDependency(getFactory(), create(":code-generators")); }

    /**
     * Creates a project dependency on the project at path ":demo"
     */
    public DemoProjectDependency getDemo() { return new DemoProjectDependency(getFactory(), create(":demo")); }

    /**
     * Creates a project dependency on the project at path ":jcstress-tests"
     */
    public JcstressTestsProjectDependency getJcstressTests() { return new JcstressTestsProjectDependency(getFactory(), create(":jcstress-tests")); }

    /**
     * Creates a project dependency on the project at path ":jmh-benchmarks"
     */
    public JmhBenchmarksProjectDependency getJmhBenchmarks() { return new JmhBenchmarksProjectDependency(getFactory(), create(":jmh-benchmarks")); }

    /**
     * Creates a project dependency on the project at path ":testing"
     */
    public TestingProjectDependency getTesting() { return new TestingProjectDependency(getFactory(), create(":testing")); }

}
