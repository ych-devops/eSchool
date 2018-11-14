package academy.softserve.eschool.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

/**
 * This class represents a connection between a teacher, an active class and a subject.
 *
 * @author Mariana Vorotniak
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherJournalDTO {

    /**
     * teacher we want to add to the journal
     */
    @ApiModelProperty(notes = "teacher to add")
    @Min(1)
    private int teacherId;

    /**
     * class of the journal that we want to add to the teacher
     */
    @ApiModelProperty(notes = "class of the journal")
    @Min(1)
    private int classId;

    /**
     * teacher's subject
     */
    @ApiModelProperty(notes = "teacher's subject")
    @Min(1)
    private int subjectId;


}
