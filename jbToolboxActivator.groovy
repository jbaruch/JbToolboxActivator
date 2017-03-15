@Grapes([
  @Grab('io.ratpack:ratpack-groovy:1.4.5'),
  @Grab('org.slf4j:slf4j-simple:1.7.21')
])
import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {
        get(':product') {
          "open jetbrains://${pathTokens.product}/".execute()
        }
    }
}
