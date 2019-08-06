// a more standard solution in C

int strStr(char * haystack, char * needle) {
    int i = 0, j = 0;
    int nh = strlen(haystack);
    int nn = strlen(needle);
    bool found = false;
    int start = -1;
    
    if (nn == 0) return 0;
    if (nh < nn) return -1;
    
    while (i < nh && j < nn){
        if (haystack[i] != needle[j]) {
            if (found) {
                i = start+1;
                j = 0;
                found = false;
                start = -1;
            } else {
                i++;
            }
        } else {
            if (!found) {
                found = true;
                start = i;
            }
            i++;
            j++;
        }
    }
    
    if (j < nn) return -1;
    
    return start;
}

