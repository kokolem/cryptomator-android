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
		supportActionBar?.setDisplayHomeAsUpEnabled(true)
	}


	override fun onMenuItemSelected(itemId: Int): Boolean = when (itemId) {
		android.R.id.home -> {
			// TODO: This is probably the wrong way, but it's the way it's done in AutoUploadChooseVaultActivity
			//  the right way would be to declare parent activity in manifest
			//  see: https://github.com/cryptomator/android/commit/84c7d0b907d2587d277c60e8a610b96bc2697015#commitcomment-71513754

			// finish this activity and does not call the onCreate method of the parent activity
			finish()
			true
		}
		else -> super.onMenuItemSelected(itemId)
	}

}