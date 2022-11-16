package com.wono.Models;

import com.wono.Utils.Enums.HandDryerType;
import com.wono.Utils.Enums.PlacementType;

/**
 * This class represents a hand dryer
 */
public class HandDryer {
    private Boolean isCurrentlyWorking;
    private PlacementType placement;
    private HandDryerType type;

    /**
     * This function sets the type of the hand dryer
     * 
     * @param type The type of hand dryer.
     */
    public void setType(HandDryerType type) {
        this.type = type;
    }

    /**
     * This function sets the placement of the HandDryer
     * 
     * @param placement The placement of the HandDryer.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * This function sets the value of the isCurrentlyWorking variable to the value of the
     * isCurrentlyWorking parameter
     * 
     * @param isCurrentlyWorking A boolean value that indicates whether the HandDryer is currently working
     * or not.
     */
    public void setIsCurrentlyWorking(Boolean isCurrentlyWorking) {
        this.isCurrentlyWorking = isCurrentlyWorking;
    }

    /**
     * This function returns the value of the isCurrentlyWorking variable
     * 
     * @return The value of the isCurrentlyWorking field.
     */
    public Boolean getIsCurrentlyWorking() {
        return this.isCurrentlyWorking;
    }

    /**
     * This function returns the placement of the HandDryer
     * 
     * @return The placement type of the HandDryer.
     */
    public PlacementType getPlacement() {
        return this.placement;
    }

    /**
     * This function returns the type of the hand dryer
     * 
     * @return The type of the hand dryer.
     */
    public HandDryerType getType() {
        return this.type;
    }

    // A constructor.
    public HandDryer(Boolean pIsCurrentlyWorking, PlacementType pPlacement, HandDryerType pType) {
        super();
        this.isCurrentlyWorking = pIsCurrentlyWorking;
        this.placement = pPlacement;
        this.type = pType;
    }
}
