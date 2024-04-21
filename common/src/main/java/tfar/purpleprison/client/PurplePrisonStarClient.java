package tfar.purpleprison.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.multiplayer.ServerSelectionList;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.resources.ResourceLocation;
import tfar.purpleprison.PurplePrisonStar;

import java.util.Locale;
import java.util.regex.Pattern;

public class PurplePrisonStarClient {

    public static void renderExtra(ServerSelectionList.OnlineServerEntry onlineServerEntry, ServerData serverData, GuiGraphics guiGraphics, int pIndex, int pTop, int pLeft, int pWidth, int pHeight,
                                   int pMouseX, int pMouseY, boolean pHovering, float pPartialTick) {
        String servername = serverData.name;
        if (matches(servername)) {
            guiGraphics.blit(PurplePrisonStar.STAR, pLeft - 34, pTop, 32, 32, 0, 0, 16, 16, 16, 16);
        }
    }

    static boolean matches(String name) {
        String lower = name.toLowerCase(Locale.ROOT);
        return lower.startsWith("purple") && lower.endsWith("prison");
    }



    /**
     * Blits a portion of the texture specified by the atlas location onto the screen at the given position and
     * dimensions with texture coordinates.
     * @param pAtlasLocation the location of the texture atlas.
     * @param pX the x-coordinate of the top-left corner of the blit position.
     * @param pY the y-coordinate of the top-left corner of the blit position.
     * @param pUOffset the horizontal texture coordinate offset.
     * @param pVOffset the vertical texture coordinate offset.
     * @param pWidth the width of the blitted portion.
     * @param pHeight the height of the blitted portion.
     * @param pTextureWidth the width of the texture.
     * @param pTextureHeight the height of the texture.
     */
    public void blit(ResourceLocation pAtlasLocation, int pX, int pY, float pUOffset, float pVOffset, int pWidth, int pHeight, int pTextureWidth, int pTextureHeight) {
    //    this.blit(pAtlasLocation, pX, pY, pWidth, pHeight, pUOffset, pVOffset, pWidth, pHeight, pTextureWidth, pTextureHeight);
    }

}
