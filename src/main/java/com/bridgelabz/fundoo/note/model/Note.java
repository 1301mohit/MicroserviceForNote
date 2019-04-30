package com.bridgelabz.fundoo.note.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "note")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noteId;
	
	@NotNull
	private String title;
	
	private String description;
	
	@JsonIgnore
	private LocalDateTime createStamp; //= LocalDate.now();
	
	@JsonIgnore
	private LocalDateTime lastModifiedStamp; //= LocalDate.now();
	
	private boolean isPinned;
	private String color;
	private boolean isArchive;
	private boolean isTrash;
	private Date remainder;
	private Long userId;
	
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	private User user;
	
//	@ManyToMany
//	@JoinTable(name = "Note_Label",
//     joinColumns = { @JoinColumn(name = "label_id") },
//     inverseJoinColumns = { @JoinColumn(name = "note_id") })
//	private List<Label> label;
	
//	@ManyToMany
//	@JoinTable(name = "Note_Label",
//     joinColumns = { @JoinColumn(name = "note_id") },
//     inverseJoinColumns = { @JoinColumn(name = "label_id") })
//	@ManyToMany
//	@JoinTable(name = "note_label",
//	joinColumns = { @JoinColumn(name = "note_id") },
//	inverseJoinColumns = { @JoinColumn(name = "label_id") })
//	private Set<Label> label;
	
//	@ManyToMany
//	@JoinTable(name = "collaborate_user",
//	joinColumns = { @JoinColumn(name = "note_id")},
//	inverseJoinColumns = { @JoinColumn(name = "user_id")})
//	private Set<User> collaboratedUser;
	
	
//	public Set<User> getCollaboratedUser() {
//		return collaboratedUser;
//	}
//	public void setCollaboratedUser(Set<User> collaboratedUser) {
//		this.collaboratedUser = collaboratedUser;
//	}
	public Long getNoteId() {
		return noteId;
	}
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreateStamp() {
		return createStamp;
	}
	public void setCreateStamp(LocalDateTime createStamp) {
		this.createStamp = createStamp;
	}
	public LocalDateTime getLastModifiedStamp() {
		return lastModifiedStamp;
	}
	public void setLastModifiedStamp(LocalDateTime lastModifiedStamp) {
		this.lastModifiedStamp = lastModifiedStamp;
	}
	public boolean isPinned() {
		return isPinned;
	}
	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isArchive() {
		return isArchive;
	}
	public void setArchive(boolean isArchive) {
		this.isArchive = isArchive;
	}
	public boolean isTrash() {
		return isTrash;
	}
	public void setTrash(boolean isTrash) {
		this.isTrash = isTrash;
	}
	public Date getRemainder() {
		return remainder;
	}
	public void setRemainder(Date remainder) {
		this.remainder = remainder;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", title=" + title + ", description=" + description + ", createStamp="
				+ createStamp + ", lastModifiedStamp=" + lastModifiedStamp + ", isPinned=" + isPinned + ", color="
				+ color + ", isArchive=" + isArchive + ", isTrash=" + isTrash + ", remainder=" + remainder + "]";
	}
	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
//	public Set<Label> getLabel() {
//		return label;
//	}
//	public void setLabel(Set<Label> label) {
//		this.label = label;
//	}
//	@Override
//	public String toString() {
//		return "Note [noteId=" + noteId + ", title=" + title + ", description=" + description + ", createStamp="
//				+ createStamp + ", lastModifiedStamp=" + lastModifiedStamp + ", isPinned=" + isPinned + ", color="
//				+ color + ", isArchive=" + isArchive + ", isTrash=" + isTrash + ", remainder=" + remainder + "]";
//	}
	
	
}
