class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>(emails.length);
        for(int i = 0; i < emails.length; i++){
            for(String email : emails){
                s.add(cleanEmail(email));
            }
        }
        return s.size();
        
    }
    private String cleanEmail(String email){
        int atIndex = email.indexOf("@");
        String local = email.substring(0,atIndex);
        String domain = email.substring(atIndex);

        if(local.contains("+")){
            local = local.substring(0,local.indexOf("+"));
        }

        local = local.replace(".","");

        return local + domain;
    }
}