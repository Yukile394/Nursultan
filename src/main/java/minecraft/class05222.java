package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class class05222 extends class05211 {
   public List<class01028> field_25629;
   protected final List<class06478> field_25630;

   public class05222(@Nullable List<class01028> var1, class00392 var2, class00392 var3) {
      super(var2);
      this.field_25631 = var1;
      this.field_25630 = Lists.newArrayList();
      this.field_25629 = ((class01590)class05191.y(var1).i_3).L(var3, 175);
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.field_25630;
   }

   protected void method_29989(class01054 var1, int var2, int var3) {
      if (this.field_25629.size() == 1) {
         var1.y((class01590)class05191.L(this.field_25631).i_3, this.field_25629.get(0), var3, var2 + 5, -1);
      } else if (this.field_25629.size() >= 2) {
         var1.y((class01590)class05191.u(this.field_25631).i_3, this.field_25629.get(0), var3, var2, -1);
         var1.y((class01590)class05191.i(this.field_25631).i_3, this.field_25629.get(1), var3, var2 + 10, -1);
      }
   }

   @Override
   public List<? extends class03434> method_37025() {
      return this.field_25630;
   }
}
