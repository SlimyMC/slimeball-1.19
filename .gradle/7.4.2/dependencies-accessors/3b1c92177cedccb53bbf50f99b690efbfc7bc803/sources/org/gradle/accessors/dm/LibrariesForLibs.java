package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AdventureLibraryAccessors laccForAdventureLibraryAccessors = new AdventureLibraryAccessors(owner);
    private final FlareLibraryAccessors laccForFlareLibraryAccessors = new FlareLibraryAccessors(owner);
    private final JcstressLibraryAccessors laccForJcstressLibraryAccessors = new JcstressLibraryAccessors(owner);
    private final JlineLibraryAccessors laccForJlineLibraryAccessors = new JlineLibraryAccessors(owner);
    private final JmhLibraryAccessors laccForJmhLibraryAccessors = new JmhLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final TinylogLibraryAccessors laccForTinylogLibraryAccessors = new TinylogLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for caffeine (com.github.ben-manes.caffeine:caffeine)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCaffeine() { return create("caffeine"); }

        /**
         * Creates a dependency provider for dependencyGetter (com.github.Minestom:DependencyGetter)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDependencyGetter() { return create("dependencyGetter"); }

        /**
         * Creates a dependency provider for fastutil (it.unimi.dsi:fastutil)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFastutil() { return create("fastutil"); }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() { return create("gson"); }

        /**
         * Creates a dependency provider for hydrazine (com.github.MadMartian:hydrazine-path-finding)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHydrazine() { return create("hydrazine"); }

        /**
         * Creates a dependency provider for jNoise (com.github.Articdive.JNoise:jnoise-pipeline)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJNoise() { return create("jNoise"); }

        /**
         * Creates a dependency provider for javaPoet (com.squareup:javapoet)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJavaPoet() { return create("javaPoet"); }

        /**
         * Creates a dependency provider for jcTools (org.jctools:jctools-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJcTools() { return create("jcTools"); }

        /**
         * Creates a dependency provider for jetbrainsAnnotations (org.jetbrains:annotations)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJetbrainsAnnotations() { return create("jetbrainsAnnotations"); }

        /**
         * Creates a dependency provider for minestomData (com.github.Minestom:MinestomDataGenerator)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMinestomData() { return create("minestomData"); }

    /**
     * Returns the group of libraries at adventure
     */
    public AdventureLibraryAccessors getAdventure() { return laccForAdventureLibraryAccessors; }

    /**
     * Returns the group of libraries at flare
     */
    public FlareLibraryAccessors getFlare() { return laccForFlareLibraryAccessors; }

    /**
     * Returns the group of libraries at jcstress
     */
    public JcstressLibraryAccessors getJcstress() { return laccForJcstressLibraryAccessors; }

    /**
     * Returns the group of libraries at jline
     */
    public JlineLibraryAccessors getJline() { return laccForJlineLibraryAccessors; }

    /**
     * Returns the group of libraries at jmh
     */
    public JmhLibraryAccessors getJmh() { return laccForJmhLibraryAccessors; }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() { return laccForJunitLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at mockito
     */
    public MockitoLibraryAccessors getMockito() { return laccForMockitoLibraryAccessors; }

    /**
     * Returns the group of libraries at tinylog
     */
    public TinylogLibraryAccessors getTinylog() { return laccForTinylogLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AdventureLibraryAccessors extends SubDependencyFactory {
        private final AdventureSerializerLibraryAccessors laccForAdventureSerializerLibraryAccessors = new AdventureSerializerLibraryAccessors(owner);
        private final AdventureTextLibraryAccessors laccForAdventureTextLibraryAccessors = new AdventureTextLibraryAccessors(owner);

        public AdventureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (net.kyori:adventure-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("adventure.api"); }

        /**
         * Returns the group of libraries at adventure.serializer
         */
        public AdventureSerializerLibraryAccessors getSerializer() { return laccForAdventureSerializerLibraryAccessors; }

        /**
         * Returns the group of libraries at adventure.text
         */
        public AdventureTextLibraryAccessors getText() { return laccForAdventureTextLibraryAccessors; }

    }

    public static class AdventureSerializerLibraryAccessors extends SubDependencyFactory {

        public AdventureSerializerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (net.kyori:adventure-text-serializer-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("adventure.serializer.gson"); }

            /**
             * Creates a dependency provider for legacy (net.kyori:adventure-text-serializer-legacy)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLegacy() { return create("adventure.serializer.legacy"); }

            /**
             * Creates a dependency provider for plain (net.kyori:adventure-text-serializer-plain)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlain() { return create("adventure.serializer.plain"); }

    }

    public static class AdventureTextLibraryAccessors extends SubDependencyFactory {
        private final AdventureTextLoggerLibraryAccessors laccForAdventureTextLoggerLibraryAccessors = new AdventureTextLoggerLibraryAccessors(owner);

        public AdventureTextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at adventure.text.logger
         */
        public AdventureTextLoggerLibraryAccessors getLogger() { return laccForAdventureTextLoggerLibraryAccessors; }

    }

    public static class AdventureTextLoggerLibraryAccessors extends SubDependencyFactory {

        public AdventureTextLoggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (net.kyori:adventure-text-logger-slf4j)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("adventure.text.logger.slf4j"); }

    }

    public static class FlareLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public FlareLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for flare (space.vectrix.flare:flare)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("flare"); }

            /**
             * Creates a dependency provider for fastutil (space.vectrix.flare:flare-fastutil)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFastutil() { return create("flare.fastutil"); }

    }

    public static class JcstressLibraryAccessors extends SubDependencyFactory {

        public JcstressLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.openjdk.jcstress:jcstress-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("jcstress.core"); }

    }

    public static class JlineLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JlineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jline (org.jline:jline)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jline"); }

            /**
             * Creates a dependency provider for jansi (org.jline:jline-terminal-jansi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJansi() { return create("jline.jansi"); }

    }

    public static class JmhLibraryAccessors extends SubDependencyFactory {

        public JmhLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotationprocessor (org.openjdk.jmh:jmh-generator-annprocess)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotationprocessor() { return create("jmh.annotationprocessor"); }

            /**
             * Creates a dependency provider for core (org.openjdk.jmh:jmh-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("jmh.core"); }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {
        private final JunitSuiteLibraryAccessors laccForJunitSuiteLibraryAccessors = new JunitSuiteLibraryAccessors(owner);

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.jupiter:junit-jupiter-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("junit.api"); }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() { return create("junit.engine"); }

            /**
             * Creates a dependency provider for params (org.junit.jupiter:junit-jupiter-params)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getParams() { return create("junit.params"); }

        /**
         * Returns the group of libraries at junit.suite
         */
        public JunitSuiteLibraryAccessors getSuite() { return laccForJunitSuiteLibraryAccessors; }

    }

    public static class JunitSuiteLibraryAccessors extends SubDependencyFactory {

        public JunitSuiteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.platform:junit-platform-suite-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("junit.suite.api"); }

            /**
             * Creates a dependency provider for engine (org.junit.platform:junit-platform-suite-engine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() { return create("junit.suite.engine"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinStdlibLibraryAccessors laccForKotlinStdlibLibraryAccessors = new KotlinStdlibLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() { return create("kotlin.reflect"); }

        /**
         * Returns the group of libraries at kotlin.stdlib
         */
        public KotlinStdlibLibraryAccessors getStdlib() { return laccForKotlinStdlibLibraryAccessors; }

    }

    public static class KotlinStdlibLibraryAccessors extends SubDependencyFactory {

        public KotlinStdlibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("kotlin.stdlib.jdk8"); }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mockito:mockito-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("mockito.core"); }

    }

    public static class TinylogLibraryAccessors extends SubDependencyFactory {

        public TinylogLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.tinylog:tinylog-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("tinylog.api"); }

            /**
             * Creates a dependency provider for impl (org.tinylog:tinylog-impl)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getImpl() { return create("tinylog.impl"); }

            /**
             * Creates a dependency provider for slf4j (org.tinylog:slf4j-tinylog)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("tinylog.slf4j"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: adventure (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAdventure() { return getVersion("adventure"); }

            /**
             * Returns the version associated to this alias: blossom (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBlossom() { return getVersion("blossom"); }

            /**
             * Returns the version associated to this alias: caffeine (3.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCaffeine() { return getVersion("caffeine"); }

            /**
             * Returns the version associated to this alias: dependencyGetter (v1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDependencyGetter() { return getVersion("dependencyGetter"); }

            /**
             * Returns the version associated to this alias: fastutil (8.5.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFastutil() { return getVersion("fastutil"); }

            /**
             * Returns the version associated to this alias: flare (2.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFlare() { return getVersion("flare"); }

            /**
             * Returns the version associated to this alias: gson (2.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: hephaistos (2.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHephaistos() { return getVersion("hephaistos"); }

            /**
             * Returns the version associated to this alias: hydrazine (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHydrazine() { return getVersion("hydrazine"); }

            /**
             * Returns the version associated to this alias: jNoise (b93008e35e)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJNoise() { return getVersion("jNoise"); }

            /**
             * Returns the version associated to this alias: javaPoet (1.13.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJavaPoet() { return getVersion("javaPoet"); }

            /**
             * Returns the version associated to this alias: jcTools (4.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJcTools() { return getVersion("jcTools"); }

            /**
             * Returns the version associated to this alias: jcstress (0.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJcstress() { return getVersion("jcstress"); }

            /**
             * Returns the version associated to this alias: jetbrainsAnnotations (23.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJetbrainsAnnotations() { return getVersion("jetbrainsAnnotations"); }

            /**
             * Returns the version associated to this alias: jline (3.21.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJline() { return getVersion("jline"); }

            /**
             * Returns the version associated to this alias: jmh (1.35)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJmh() { return getVersion("jmh"); }

            /**
             * Returns the version associated to this alias: kotlin (1.7.22)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: minestomData (1c1921cd41)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinestomData() { return getVersion("minestomData"); }

            /**
             * Returns the version associated to this alias: mockito (4.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockito() { return getVersion("mockito"); }

            /**
             * Returns the version associated to this alias: tinylog (2.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTinylog() { return getVersion("tinylog"); }

        /**
         * Returns the group of versions at versions.junit
         */
        public JunitVersionAccessors getJunit() { return vaccForJunitVersionAccessors; }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: junit.jupiter (5.8.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJupiter() { return getVersion("junit.jupiter"); }

            /**
             * Returns the version associated to this alias: junit.platform (1.8.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlatform() { return getVersion("junit.platform"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for adventure which is an aggregate for the following dependencies:
             * <ul>
             *    <li>net.kyori:adventure-api</li>
             *    <li>net.kyori:adventure-text-serializer-gson</li>
             *    <li>net.kyori:adventure-text-serializer-legacy</li>
             *    <li>net.kyori:adventure-text-serializer-plain</li>
             *    <li>net.kyori:adventure-text-logger-slf4j</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAdventure() { return createBundle("adventure"); }

            /**
             * Creates a dependency bundle provider for flare which is an aggregate for the following dependencies:
             * <ul>
             *    <li>space.vectrix.flare:flare</li>
             *    <li>space.vectrix.flare:flare-fastutil</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getFlare() { return createBundle("flare"); }

            /**
             * Creates a dependency bundle provider for kotlin which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlin:kotlin-stdlib-jdk8</li>
             *    <li>org.jetbrains.kotlin:kotlin-reflect</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKotlin() { return createBundle("kotlin"); }

            /**
             * Creates a dependency bundle provider for logging which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.tinylog:tinylog-api</li>
             *    <li>org.tinylog:tinylog-impl</li>
             *    <li>org.tinylog:slf4j-tinylog</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLogging() { return createBundle("logging"); }

            /**
             * Creates a dependency bundle provider for terminal which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jline:jline</li>
             *    <li>org.jline:jline-terminal-jansi</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTerminal() { return createBundle("terminal"); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for blossom to the plugin id 'net.kyori.blossom'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBlossom() { return createPlugin("blossom"); }

    }

}
