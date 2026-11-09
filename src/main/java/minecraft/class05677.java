package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import java.util.List;

public enum class05677 implements class05033 {
   field_17032("REPLACE", 0, "replace"),
   field_17033("APPEND", 1, "append"),
   field_17034("MERGE", 2, "merge");

   public static final Codec<class05677> field_45821 = class05033.N(class05677::values);
   private final String field_17035;

   class05677(String var3) {
      this.field_17035 = var3;
   }

   public abstract void N(class07709 var1, class07793 var2, List<class07709> var3) throws CommandSyntaxException;

   @Override
   public String method_15434() {
      return this.field_17035;
   }
}
