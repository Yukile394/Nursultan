package minecraft;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import java.util.Objects;

public class class04952 implements Comparator<class04981> {
   private final String N;

   public class04952(String var1) {
      super();
      this.N = var1;
   }

   public int compare(class04981 var1, class04981 var2) {
      return ComparisonChain.start()
         .compareTrueFirst(var1.Z(), var2.Z())
         .compareTrueFirst(var1.R == class04961.field_19435, var2.R == class04961.field_19435)
         .compareTrueFirst(var1.E, var2.E)
         .compareTrueFirst(Objects.equals(var1.M, this.N), Objects.equals(var2.M, this.N))
         .compareFalseFirst(var1.U, var2.U)
         .compareTrueFirst(var1.R == class04961.field_19434, var2.R == class04961.field_19434)
         .compare(var1.y, var2.y)
         .result();
   }
}
