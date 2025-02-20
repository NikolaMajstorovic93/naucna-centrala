//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ScientificCentreData
{
    using System;
    using System.Collections.Generic;
    
    public partial class ScientificCentreUser
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public ScientificCentreUser()
        {
            this.Payments = new HashSet<Payment>();
            this.ProjectAuthors = new HashSet<ProjectAuthor>();
            this.Subscriptions = new HashSet<Subscription>();
            this.UserInventories = new HashSet<UserInventory>();
            this.Tasks = new HashSet<Task>();
            this.MagazineWorkers = new HashSet<MagazineWorker>();
            this.AuthorComments = new HashSet<AuthorComment>();
            this.ProjectReviews = new HashSet<ProjectReview>();
            this.ProjectsEditors = new HashSet<ProjectsEditor>();
            this.CamundaUserProcesses = new HashSet<CamundaUserProcess>();
        }
    
        public System.Guid UserId { get; set; }
        public string Username { get; set; }
        public string Email { get; set; }
        public string Name { get; set; }
        public string Surname { get; set; }
        public Nullable<int> TownId { get; set; }
        public string Phone { get; set; }
        public string Title { get; set; }
        public Nullable<byte> ReaderAuthorOther { get; set; }
        public Nullable<System.Guid> CamundaTaskId { get; set; }
        public string TaskType { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Payment> Payments { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<ProjectAuthor> ProjectAuthors { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Subscription> Subscriptions { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<UserInventory> UserInventories { get; set; }
        public virtual Town Town { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Task> Tasks { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<MagazineWorker> MagazineWorkers { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<AuthorComment> AuthorComments { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<ProjectReview> ProjectReviews { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<ProjectsEditor> ProjectsEditors { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<CamundaUserProcess> CamundaUserProcesses { get; set; }
    }
}
