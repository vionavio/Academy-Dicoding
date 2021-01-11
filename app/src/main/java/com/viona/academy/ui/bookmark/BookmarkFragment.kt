package com.viona.academy.ui.bookmark

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.viona.academy.R
import com.viona.academy.adapter.AcademyAdapter
import com.viona.academy.adapter.BookmarkAdapter
import com.viona.academy.data.CourseEntity
import com.viona.academy.databinding.FragmentAcademyBinding
import com.viona.academy.utils.DataDummy

class BookmarkFragment : Fragment(), BookmarkFragmentCallback {

    private lateinit var fragmentAcademyBinding: FragmentAcademyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentAcademyBinding = FragmentAcademyBinding.inflate(layoutInflater, container, false)
        return fragmentAcademyBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val courses = DataDummy.generaeteDummyCourse()
            val bookmarkAdapter = BookmarkAdapter(this)
            bookmarkAdapter.setCourses(courses)

            with(fragmentAcademyBinding.rvAcademy) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = bookmarkAdapter
            }
        }
    }

    override fun onShareClick(courseEntity: CourseEntity) {

        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Share this application now!!")
                .setText(resources.getString(R.string.share_text, courseEntity.title))
                .startChooser()
        }
    }
}