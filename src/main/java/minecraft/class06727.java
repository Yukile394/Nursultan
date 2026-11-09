package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class06727 implements class04942 {
   @SerializedName("name")
   @Nullable
   public String N;
   @SerializedName("uuid")
   @JsonAdapter(UUIDTypeAdapter.class)
   @Nullable
   public UUID y;

   public class06727() {
      super();
   }
}
