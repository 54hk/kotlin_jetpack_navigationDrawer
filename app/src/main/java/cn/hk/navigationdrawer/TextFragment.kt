package cn.hk.navigationdrawer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.content_layout.*

class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e("TTTT" , "TextFragment")
        requireActivity().also {
            it.collapsingToolBar.title = getString(R.string.text_fragment_title)
            it.collapsingImg.setImageResource(R.drawable.ic_baseline_looks_one_24)
            it.ivBackground.setImageResource(R.drawable.beijing3)
        }
        return inflater.inflate(R.layout.fragment_text, container, false)
    }

}