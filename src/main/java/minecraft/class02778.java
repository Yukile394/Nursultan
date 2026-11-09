package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Name("minecraft.StructureGeneration")
@Label("Structure Generation")
@Category({"Minecraft", "World Generation"})
@StackTrace(false)
@Enabled(false)
public class class02778 extends Event {
   public static final String N = "minecraft.StructureGeneration";
   public static final EventType y = EventType.getEventType(class02778.class);
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int L;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int u;
   @Name("structure")
   @Label("Structure")
   public final String i;
   @Name("level")
   @Label("Level")
   public final String R;
   @Name("success")
   @Label("Success")
   public boolean M;

   public class02778(class07321 var1, class03556<class04748> var2, class05946<class07299> var3) {
      super();
      this.L = var1.B;
      this.u = var1.Z;
      this.i = var2.M();
      this.R = var3.N().toString();
   }
}
