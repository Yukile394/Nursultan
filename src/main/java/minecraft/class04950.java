package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class class04950 extends class05105 implements class04942 {
   @SerializedName("name")
   public final String N;
   @SerializedName("uuid")
   @JsonAdapter(UUIDTypeAdapter.class)
   public final UUID y;
   @SerializedName("operator")
   public boolean L;
   @SerializedName("accepted")
   public final boolean u;
   @SerializedName("online")
   public final boolean i;

   public class04950(String var1, UUID var2, boolean var3, boolean var4, boolean var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }
}
