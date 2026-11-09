package minecraft;

import java.util.Comparator;

public record class04001(class03987 angerManagement) implements Comparator<class07049> {
   protected class04001(class03987 angerManagement) {
      this.angerManagement = angerManagement;
   }

   public class03987 N() {
      return this.angerManagement;
   }

   public int compare(class07049 var1, class07049 var2) {
      if (var1.equals(var2)) {
         return 0;
      } else {
         int i = this.angerManagement.i.getOrDefault(var1, 0);
         int j = this.angerManagement.i.getOrDefault(var2, 0);
         this.angerManagement.L = Math.max(this.angerManagement.L, Math.max(i, j));
         boolean flag = class04009.N(i).u();
         boolean flag1 = class04009.N(j).u();
         if (flag != flag1) {
            return flag ? -1 : 1;
         } else {
            boolean flag2 = var1 instanceof class08036;
            boolean flag3 = var2 instanceof class08036;
            if (flag2 != flag3) {
               return flag2 ? -1 : 1;
            } else {
               return Integer.compare(j, i);
            }
         }
      }
   }
}
