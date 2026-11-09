package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Name("minecraft.ChunkGeneration")
@Label("Chunk Generation")
@Category({"Minecraft", "World Generation"})
@StackTrace(false)
@Enabled(false)
public class class02803 extends Event {
   public static final String N = "minecraft.ChunkGeneration";
   public static final EventType y = EventType.getEventType(class02803.class);
   @Name("worldPosX")
   @Label("First Block X World Position")
   public final int L;
   @Name("worldPosZ")
   @Label("First Block Z World Position")
   public final int u;
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int i;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int R;
   @Name("status")
   @Label("Status")
   public final String M;
   @Name("level")
   @Label("Level")
   public final String B;

   public class02803(class07321 var1, class05946<class07299> var2, String var3) {
      super();
      this.M = var3;
      this.B = var2.N().toString();
      this.i = var1.B;
      this.R = var1.Z;
      this.L = var1.i();
      this.u = var1.R();
   }
}
