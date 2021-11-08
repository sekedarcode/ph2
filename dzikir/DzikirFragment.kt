package pip.com.apkmuslimquran.ui.dzikir

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*
import kotlinx.android.synthetic.main.fragment_dzikir_pp.*

import pip.com.apkmuslimquran.KeutamaanDzikir
import pip.com.apkmuslimquran.MainActivity
import pip.com.apkmuslimquran.R
import pip.com.apkmuslimquran.databinding.FragmentDzikirPpBinding


class DzikirFragment : Fragment(R.layout.fragment_dzikir_pp){
    private val binding : FragmentDzikirPpBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.carddzikirpagi.setOnClickListener{
            val intent = Intent(context, DzikirPagi::class.java)
            startActivity(intent)
        }
        binding.carddzikirpetang.setOnClickListener{
            val intent = Intent(context, DzikirPetang::class.java)
            startActivity(intent)
        }

        binding.backDzikir.setOnClickListener {
            activity?.onBackPressed()
        }
        binding.cardkeutamaan.setOnClickListener {
            val intent = Intent(requireContext(), KeutamaanDzikir::class.java)
            startActivity(intent)
        }
    }
}