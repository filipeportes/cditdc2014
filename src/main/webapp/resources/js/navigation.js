var path = document.URL.substring(0, document.URL.lastIndexOf("/"));

function getPageIndex() {

    var pieces = document.URL.split("/");

    var page = pieces[pieces.length - 1];
    if (page == "") {
        return 0;
    }

    for (i = 0; i < pages.length; i++) {
        if (pages[i] == page) {
            return i;
        }
    }
}

function next() {
    if (pageIndex < pages.length - 1) {
        window.location.href = path + "/" + pages[pageIndex + 1];
    }
}

function previous() {
    if (pageIndex > 0) {
        window.location.href = path + "/" + pages[pageIndex - 1];
    }
}


