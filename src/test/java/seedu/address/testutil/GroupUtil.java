package seedu.address.testutil;

import seedu.address.logic.commands.AddGroupCommand;
import seedu.address.model.group.Group;

/**
 * A utility class for Group.
 */
public class GroupUtil {

    /**
     * Returns an addGroup command string for adding the {@code group}.
     */
    public static String getAddGroupCommand(Group group) {
        return AddGroupCommand.COMMAND_WORD + " " + getGroupDetails(group);
    }

    /**
     * Returns the part of command string for the given {@code group}'s details.
     */
    public static String getGroupDetails(Group group) {
        StringBuilder sb = new StringBuilder();
        sb.append(group.getInformation().value);
        return sb.toString();
    }
}
