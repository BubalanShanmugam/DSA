// class Solution {
//     public List<String> removeSubfolders(String[] folder) {
//         List<String> list = new ArrayList<>();

//         Arrays.sort(folder);
//         int j = 1;
//         int i = 0;

//         while(i<folder.length){
//             while(j<folder.length){
//                 if(folder[j].contains(folder[i])){
//                     if(list.isEmpty() || !list.contains(folder[i])){
//                         list.add(folder[i]);
//                     }
//                     i=j;
//                     break;
//                 }
//                 j++;
//             }
//             i++;
//         }
//         return list;
//     }
// }







class Solution {

    public List<String> removeSubfolders(String[] folder) {
        // Sort the folders alphabetically
        Arrays.sort(folder);

        // Initialize the result list and add the first folder
        List<String> result = new ArrayList<>();
        result.add(folder[0]);

        // Iterate through each folder and check if it's a sub-folder of the last added folder in the result
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = result.get(result.size() - 1);
            lastFolder += '/';

            // Check if the current folder starts with the last added folder path
            if (!folder[i].startsWith(lastFolder)) {
                result.add(folder[i]);
            }
        }

        // Return the result containing only non-sub-folders
        return result;
    }
}