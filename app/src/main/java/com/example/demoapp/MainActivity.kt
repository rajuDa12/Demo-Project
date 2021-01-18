package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
//import com.onesignal.OneSignal
import com.teamokcodex.numbersystem.Adapter.PageAdapter


class MainActivity : AppCompatActivity() {

    private var tableLayout: TabLayout? = null
    private val ONESIGNAL_APP_ID = "bb6c5a27-b17e-4fc5-bb60-e96c32b310f8"
    private var toolbar: Toolbar? = null

    private var viewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



                toolbar = findViewById(R.id.toolbar)
                setSupportActionBar(toolbar)
                viewPager = findViewById(R.id.view)
                tableLayout = findViewById(R.id.tab)



//
//                OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
//                // OneSignal Initialization
//                OneSignal.initWithContext(this);
//                OneSignal.setAppId(ONESIGNAL_APP_ID);

                setUpTabs()
            }


            override fun onCreateOptionsMenu(menu: Menu?): Boolean {
                val menuInflater = menuInflater
                menuInflater.inflate(R.menu.menuitem, menu)

                return super.onCreateOptionsMenu(menu)
            }

            override fun onOptionsItemSelected(item: MenuItem): Boolean {

                return when (item.itemId) {
                    R.id.shareitem_id -> {

                        val intent = Intent(Intent.ACTION_SEND)
                        intent.type = "type/plain"
                        val body = "your body"
                        val sub = "your sub is here.."
                        intent.putExtra(Intent.EXTRA_SUBJECT, sub)
                        intent.putExtra(Intent.EXTRA_TEXT, body)
                        startActivity(Intent.createChooser(intent, "you share this app..."))
                        true
                    }

                    R.id.policyitem_id -> {
                        Toast.makeText(this, "this is clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }
                    R.id.rateitem_id -> {
                        Toast.makeText(this, "this is clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }

                    R.id.contactitem_id -> {
                        val intent = Intent(this, ContactActivity::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> super.onOptionsItemSelected(item)
                }


            }


            private fun setUpTabs() {
                val adapter = PageAdapter(supportFragmentManager)
                adapter.addFragment(CodingFragment(), "HOME")
                adapter.addFragment(LearnFragment(), "LEARN")
                viewPager?.adapter = adapter
                tableLayout?.setupWithViewPager(viewPager)

            }


        }





