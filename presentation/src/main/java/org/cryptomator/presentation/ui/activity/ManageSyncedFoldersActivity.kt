package org.cryptomator.presentation.ui.activity

import org.cryptomator.generator.Activity
import org.cryptomator.presentation.R
import kotlinx.android.synthetic.main.toolbar_layout.toolbar

@Activity(layout = R.layout.activity_manage_synced_folders)
class ManageSyncedFoldersActivity : BaseActivity() {

	override fun setupView() {
		setupToolbar()
	}

	private fun setupToolbar() {
		toolbar.title = getString(R.string.screen_settings_folder_sync_title)
		setSupportActionBar(toolbar)

		// FIXME: The back arrow does nothing, same issue as https://github.com/cryptomator/android/issues/438
		supportActionBar?.setDisplayHomeAsUpEnabled(true)
	}

}