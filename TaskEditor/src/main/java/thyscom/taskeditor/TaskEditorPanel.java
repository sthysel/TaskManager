/*
 * TaskEditorPanel.java
 *
 * Created on May 26, 2011, 2:14:34 PM
 */
package thyscom.taskeditor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.log4j.Logger;
import thyscom.taskmodel.api.Task;

/**
 *
 * @author thys
 */
public class TaskEditorPanel extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(TaskEditorPanel.class.getName());
    private Task task = null;
    private DocumentListener docListener;
    private PropertyChangeSupport pcs;
    public static final String PROPERTY_NEW_TASK = "TASK_CHANGE";

    /** Creates new form TaskEditorPanel */
    public TaskEditorPanel() {
        makeDocumentListerner();
        initComponents();
    }

    // The topcomponent wants the tasks
    public Task getTask() {
        return task;
    }
    
    public void setTask(Task task) {
        Task old = this.task;
        this.task = task;
        updateForm();
        pcs.firePropertyChange(PROPERTY_NEW_TASK, old, task);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        taskIDText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        parentIDText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dueDateText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prioritySlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        progresSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();

        jLabel1.setText("Task ID");

        taskIDText.setEditable(false);

        jLabel2.setText("Parent ID");

        parentIDText.setEditable(false);

        nameText.getDocument().addDocumentListener(docListener);

        jLabel3.setText("Name");

        dueDateText.getDocument().addDocumentListener(docListener);

        jLabel4.setText("Due date");

        prioritySlider.setMajorTickSpacing(1);
        prioritySlider.setMaximum(2);
        prioritySlider.setPaintLabels(true);
        prioritySlider.setPaintTicks(true);
        prioritySlider.setSnapToTicks(true);
        prioritySlider.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        prioritySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                prioritySliderStateChanged(evt);
            }
        });

        jLabel5.setText("Priority");

        progresSlider.setMajorTickSpacing(25);
        progresSlider.setPaintLabels(true);
        progresSlider.setPaintTicks(true);
        progresSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresSliderStateChanged(evt);
            }
        });

        jLabel6.setText("Progress");

        descriptionText.setColumns(20);
        descriptionText.setRows(5);
        descriptionText.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        descriptionText.getDocument().addDocumentListener(docListener);
        jScrollPane1.setViewportView(descriptionText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addComponent(prioritySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addComponent(progresSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(taskIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dueDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(parentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prioritySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progresSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prioritySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prioritySliderStateChanged
        updateTask();
    }//GEN-LAST:event_prioritySliderStateChanged

    private void progresSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresSliderStateChanged
        updateTask();
    }//GEN-LAST:event_progresSliderStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JTextField dueDateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField parentIDText;
    private javax.swing.JSlider prioritySlider;
    private javax.swing.JSlider progresSlider;
    private javax.swing.JTextField taskIDText;
    // End of variables declaration//GEN-END:variables

    /**
     * Update the form with the Task values
     */
    private void updateForm() {
        nameText.setText(task.getName());
        taskIDText.setText(task.getId());
        descriptionText.setText(task.getDescription());
        dueDateText.setText(DateFormat.getDateInstance().format(task.getDueDate()));
        parentIDText.setText(task.getParentId());
        setPriority();
        setProgress();
    }

    private void setPriority() {
        Task.Priority priority = task.getPriority();
        if (priority == Task.Priority.LOW) {
            prioritySlider.setValue(0);
        }
        if (priority == Task.Priority.MEDIUM) {
            prioritySlider.setValue(1);
        }
        if (priority == Task.Priority.HIGH) {
            prioritySlider.setValue(2);
        }
    }

    private void setProgress() {
        int progress = task.getProgress();
        progresSlider.setValue(progress);
    }

    /**
     * Update the Task with the values from the form
     */
    private void updateTask() {
        if (task == null) {
            return;
        }
        updateTaskDueDate();
        updateTaskPriority();
        task.setProgress(progresSlider.getValue());
        task.setName(nameText.getText());
        task.setDescription(descriptionText.getText());
    }

    private void updateTaskDueDate() {
        Date due = null;
        try {
            due = DateFormat.getInstance().parse(dueDateText.getText());
        } catch (ParseException ex) {
            logger.error(ex.getMessage());
            due = new Date();
        }
        task.setDueDate(due);
    }

    private void updateTaskPriority() {
        if (!prioritySlider.getValueIsAdjusting()) {
            Task.Priority pri = null;
            int priority = prioritySlider.getValue();
            switch (priority) {
                case 0:
                    pri = Task.Priority.LOW;
                    break;
                case 1:
                    pri = Task.Priority.MEDIUM;
                    break;
                case 2:
                    pri = Task.Priority.HIGH;
                    break;
            }
            task.setPriority(pri);
        }
    }

    private void makeDocumentListerner() {
        docListener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTask();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTask();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTask();
            }
        };
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if (pcs == null) {
            pcs = new PropertyChangeSupport(this);
        }
        pcs.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        if (pcs != null) {
            pcs.removePropertyChangeListener(listener);
        }
    }
}
