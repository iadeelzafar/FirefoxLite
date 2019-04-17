package org.mozilla.rocket.content


class ContentPortalPresenter {

    fun hasTab() : Boolean{
        return false
    }

    fun inflateView() {
        if (hasTab()) {
            // inflate tab with views
        } else {
            // inflate related view
        }
    }

}