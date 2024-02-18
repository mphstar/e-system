package dev.diprojectin.esystem.ui.absensi_page.sign_in_absensi_page

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivitySignInAbsensiBinding
import org.json.JSONException
import java.io.IOException

class SignInAbsensiActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivitySignInAbsensiBinding
    private lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInAbsensiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapView) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        try {
            val latLngCamera = LatLng(-7.8546511565849935, 110.3318536769938)
            val cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLngCamera, 10.0f)
            googleMap.animateCamera(cameraUpdate)
            googleMap.setOnMarkerClickListener { marker: Marker? -> false }
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}