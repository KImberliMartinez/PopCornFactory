package martinez.kimberli.popcornfactory

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ResumenCompraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resumen_compra)


        val movieName = intent.getStringExtra("movieName")
        val seat = intent.getStringExtra("seat")
        val cliente = intent.getStringExtra("cliente")
        val posMovie = intent.getIntExtra("posMovie", -1)


        val movieText = findViewById<TextView>(R.id.movieTitle)
        val seatText = findViewById<TextView>(R.id.seatSelected)
        val clienteText = findViewById<TextView>(R.id.clienteNombre)
        val imageView = findViewById<ImageView>(R.id.movieImage)



        movieText.text = "Película: $movieName"
        seatText.text = "Asiento: $seat"
        clienteText.text = "Cliente: $cliente"




        if (posMovie!=-1) {
            imageView.setImageResource(posMovie)
        } else {
            imageView.setImageResource(R.drawable.photo15770331178926d498c6c7921)
        }

    }

}