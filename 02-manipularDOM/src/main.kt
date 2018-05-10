import kotlin.browser.document

/**
 * Created by vicboma on 08/05/2018.
 */
fun main(args: Array<String>) {

    val elements = arrayListOf(

            document.createElement("h1").apply {  textContent = "Manipulando el DOM" },
            document.createElement("h2").apply {  textContent = "desde código" },
            document.createElement("h3").apply {  textContent = "con elementos" },
            document.createElement("h4").apply {  textContent = "diferentes" },
            document.createElement("button")
                    .apply {
                        textContent="    Borrar body html      "
                        addEventListener("click",{
                            document.body?.remove()
                        })
                    }
    )

    for (it in elements)
        document.body?.appendChild(it)
}
