/**
 * Precompiled [minestom.common-conventions.gradle.kts][Minestom_common_conventions_gradle] script plugin.
 *
 * @see Minestom_common_conventions_gradle
 */
class Minestom_commonConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Minestom_common_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
