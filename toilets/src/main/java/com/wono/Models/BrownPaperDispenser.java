package com.wono.Models;

import com.wono.Utils.Enums.PlacementType;

/**
 * A BrownPaperDispenser is a dispenser that dispenses brown paper.
 */
public class BrownPaperDispenser extends Entity {
    private Boolean isCurrentlyEmpty;
    private Boolean isCurrentlyWorking;
    private PlacementType placement;

    /**
     * This function sets the value of the isCurrentlyEmpty variable to the value of the
     * isCurrentlyEmpty parameter
     * 
     * @param isCurrentlyEmpty This is a boolean value that indicates whether the BrownPaperDispenser is
     * currently empty or not.
     */
    public void setIsCurrentlyEmpty(Boolean isCurrentlyEmpty) {
        this.isCurrentlyEmpty = isCurrentlyEmpty;
    }

    /**
     * This function sets the value of the isCurrentlyWorking variable to the value of the
     * isCurrentlyWorking parameter
     * 
     * @param isCurrentlyWorking A boolean value that indicates whether the BrownPaperDispenser is currently working
     * or not.
     */
    public void setIsCurrentlyWorking(Boolean isCurrentlyWorking) {
        this.isCurrentlyWorking = isCurrentlyWorking;
    }

    /**
     * This function sets the placement of the BrownPaperDispenser
     * 
     * @param placement The placement type of the BrownPaperDispenser.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * This function returns if the BrownPaperDispenser is currently empty.
     * 
     * @return The value of the isCurrentlyEmpty variable.
     */
    public Boolean getIsCurrentlyEmpty() {
        return this.isCurrentlyEmpty;
    }

    /**
     * This function returns if the BrownPaperDispenser is currently working.
     * 
     * @return The value of the isCurrentlyWorking field.
     */
    public Boolean getIsCurrentlyWorking() {
        return this.isCurrentlyWorking;
    }

    /**
     * This function returns the placement of the BrownPaperDispenser.
     * 
     * @return The placement type of the BrownPaperDispenser.
     */
    public PlacementType getPlacement() {
        return this.placement;
    }

    // A constructor.
    public BrownPaperDispenser(Boolean pIsCurrentlyEmpty, Boolean pIsCurrentlyWorking,
            PlacementType pPlacement) {
        super();
        this.isCurrentlyEmpty = pIsCurrentlyEmpty;
        this.isCurrentlyWorking = pIsCurrentlyWorking;
        this.placement = pPlacement;
    }
}
