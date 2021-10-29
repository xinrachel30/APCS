public String doubleChar(String str) {
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      ans += str.substring(i, i+1) + str.substring(i, i+1);
    }
    return ans;
}
