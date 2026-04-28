class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for(String email : emails){
            s.add(mailCleaner(email));
        }
        return s.size();
    }

    private String mailCleaner(String email) {
        int index = email.indexOf("@");
        String local = email.substring(0, index);
        String domain = email.substring(index);

        if (local.contains("+")) {
            local = local.substring(0, email.indexOf("+"));
        }
        if (local.contains(".")) {
            local = local.replace(".", "");
        }
        

        return local + domain;
    }
}