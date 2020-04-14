function goBack(time) {
    if (arguments.length == 0) {
        history.back();
    } else {
        history.go(time);
    }
}