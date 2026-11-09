package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public final class class00072 implements class04942 {
   @SerializedName("slotId")
   public int N;
   @SerializedName("options")
   @JsonAdapter(class00052.class)
   public class04980 y;
   @SerializedName("settings")
   public List<class00064> L;

   public class00072(int var1, class04980 var2, List<class00064> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public boolean y() {
      return class00064.N(this.L);
   }

   public static class00072 N(int var0) {
      return new class00072(var0, class04980.y(), List.of(class00064.N(false)));
   }

   public class00072 N() {
      return new class00072(this.N, this.y.L(), new ArrayList<>(this.L));
   }
}
