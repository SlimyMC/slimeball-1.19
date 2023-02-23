/**
 * Precompiled [minestom.native-conventions.gradle.kts][Minestom_native_conventions_gradle] script plugin.
 *
 * @see Minestom_native_conventions_gradle
 */
class Minestom_nativeConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Minestom_native_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
