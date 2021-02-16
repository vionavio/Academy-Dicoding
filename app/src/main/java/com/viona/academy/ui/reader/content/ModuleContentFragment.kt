package com.viona.academy.ui.reader.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.viona.academy.data.ModuleEntity
import com.viona.academy.databinding.FragmentModuleContentBinding
import com.viona.academy.ui.reader.CourseReaderViewModel
import com.viona.academy.viewmodel.ViewModelFactory

class ModuleContentFragment : Fragment() {

    companion object {
        val TAG: String = ModuleContentFragment::class.java.simpleName
        fun newInstance(): ModuleContentFragment = ModuleContentFragment()
    }

    private lateinit var fragmentModuleContentBinding: FragmentModuleContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentModuleContentBinding =
            FragmentModuleContentBinding.inflate(inflater, container, false)
        return fragmentModuleContentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel =
                ViewModelProvider(requireActivity(), factory)[CourseReaderViewModel::class.java]

            populateWebView(viewModel.getSelectedModule())
        }
    }

    private fun populateWebView(content: ModuleEntity) {
        fragmentModuleContentBinding.webView.loadData(
            content.contentEntity?.content ?: "",
            "text/html",
            "UTF-8"
        )
    }
}