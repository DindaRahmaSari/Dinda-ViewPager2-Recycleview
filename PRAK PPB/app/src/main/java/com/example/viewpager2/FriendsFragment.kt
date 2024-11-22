package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter
    private val friend = mutableListOf<MyFriend>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecyclerView()
        return view
    }
    private fun setupRecyclerView() {
        friend.addAll(
            listOf(
                MyFriend("dinda", "08843057357", "dinda@gmail.com",R.drawable.teman),
                MyFriend("Brynka Nobara", "08758553337", "Brynkaa@gmail.com", R.drawable.dinda2),
                MyFriend("Yelanka Avorika", "087947844699", "yelanka@gmail.com", R.drawable.dinda6),
                MyFriend("Raykana","065399756539", "Raykana@gmail.com", R.drawable.dinda2),
                MyFriend("VoliaNia","096527428745","Voliana@gmail.com", R.drawable.dinda3),
                MyFriend("Jevanka Serano","045837494684","Jevanka@gmail.com", R.drawable.teman),
                MyFriend("bekyka Branatia","056398265738","bekyka@gmail.com", R.drawable.dinda5)
            )
        )
        friendAdapter = MyFriendAdapter(friend)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}